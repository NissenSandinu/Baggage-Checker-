package Baggage;
/*
 * Author: Nissen Sandinu Wettasinghe
 * Modified Date: July 28, 2024
 * Description:
 * This class provides utility methods for checking baggage properties such as weight limits, 
 * carry-on eligibility, and surcharge calculations. It defines constants for maximum dimensions, 
 * weight, and surcharges, and offers static methods for validation and computation.
 */
public class BaggageChecker {

      public static final double  MAX_REGULAR_WEIGHT = 22.00; // Maximum regular weight in kg.
      public static final int MAX_CARRYON_DIMENSION = 36; // Maximum dimension for carry-on baggage in cm.
      public static final int MAX_SUM_DIMENSIONS = 192; // Maximum sum of dimensions for baggage in cm.
      public static final double SURCHARGE_PER_KG = 3.00; // Surcharge per kg for overweight baggage.
      
      // Method to check if the baggage weight exceeds the maximum regular weight
      public static boolean allowedWeightIsMoreThanMax(Baggage bag) {//Baggage baggage access the 
          // If the baggage weight is greater than the maximum regular weight, return true
          if (bag.getWeight() > MAX_REGULAR_WEIGHT) {
                return true;
              } else {// Otherwise, return false
                  return false;
              }
          }
      // Method to calculate the weight surcharge for overweight baggage
      public static double calculateWeightSurcharge(Baggage bag) {
          // If the baggage weight is greater than the maximum regular weight
          if (bag.getWeight() > MAX_REGULAR_WEIGHT) {
                  return (bag.getWeight() - MAX_REGULAR_WEIGHT) * SURCHARGE_PER_KG;
              } else {// Otherwise, return 0.0
                  return 0.0 ;
              }
          }
      // Method to check if the baggage can be used as a carry-on
      public static boolean canBeUsedAsACarryOn(Baggage bag) {
          // If all dimensions are less than the maximum carry-on dimension, return true
          if (bag.getLength() < MAX_CARRYON_DIMENSION && // && used from the lecture notes 
                  bag.getWidth() < MAX_CARRYON_DIMENSION &&
                  bag.getHeight() < MAX_CARRYON_DIMENSION) {
                  return true;
              } else {// Otherwise, return false
                  return false;
              }
          }
      // Method to check if the sum of the baggage dimensions exceeds the maximum allowed
      public static boolean sumDimensionsExceedsMax(Baggage bag) {
          // If the sum of length, width, and height exceeds the maximum sum of dimensions, return true
          if (bag.getLength() + bag.getWidth() + bag.getHeight() > MAX_SUM_DIMENSIONS) {
                return true;
             } else {// Otherwise, return false
                 return false;
             }
         }
        }