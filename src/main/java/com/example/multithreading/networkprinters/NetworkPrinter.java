package com.example.multithreading.networkprinters;

public interface NetworkPrinter {
    void printPage(String threadid);
    void faxPage(String threadid);
}
