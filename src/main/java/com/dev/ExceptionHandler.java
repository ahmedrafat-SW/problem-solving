package com.dev;

import java.io.IOException;

public class ExceptionHandler {

    public static void main(String[] args) {
        try {
            writeToFileZipFileContents("zip-file", "outfile");
        } catch (IOException e) {
            try {
                throw new RuntimeException(e);
            } catch (RuntimeException ex) {
                throw new RuntimeException(ex);
            } finally {
                System.out.println("finally block executed");
            }
        }
    }

    public static void writeToFileZipFileContents(String zipFileName, String outputFileName)
            throws java.io.IOException {

        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.US_ASCII;
        java.nio.file.Path outputFilePath = java.nio.file.Paths.get(outputFileName);

        // Open zip file and create output file with
        // try-with-resources statement

        try (
                java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFileName);
                java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(outputFilePath, charset)
        ) {
            // Enumerate each entry
            for (java.util.Enumeration entries = zf.entries(); entries.hasMoreElements();) {
                // Get the entry name and write it to the output file
                String newLine = System.getProperty("line.separator");

                String zipEntryName = ((java.util.zip.ZipEntry)entries.nextElement()).getName() + newLine;

                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        }
    }


    public static void createZipFile(String name) throws IOException {
        try (
                java.util.zip.ZipFile zf = new java.util.zip.ZipFile(name);
            )
        {

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

        }

    }

}
