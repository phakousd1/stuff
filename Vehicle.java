package edu.canisius.csc.lsp.exam3;

public interface Vehicle {
    double getAverageMilesPerGallon();
    void incrementMileageAndGallons(int additionalMiles, int additionalGallons);
    double getTotalMilesDriven();
    double getTotalGallonsUsed();
}