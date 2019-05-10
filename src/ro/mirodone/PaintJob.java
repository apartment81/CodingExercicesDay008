package ro.mirodone;

public class PaintJob {

    //write a program that helps Ion calculate how many buckets of paint he needs to buy.
    //Ion might have some buckets of paint at home; also knows the are that can cover with 1 bucket of paint.




    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        double bucketsNeeded = Math.ceil(area / areaPerBucket);

        return (int) bucketsNeeded;

    }

    public  int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double bucketsNeeded = Math.ceil(area / areaPerBucket);

        return (int) bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (extraBuckets < 0 || (width <= 0 || height <= 0 || areaPerBucket <= 0)) {
            return -1;
        }

        double area = width * height;
        double bucketsNeeded = area / areaPerBucket;
        bucketsNeeded = Math.ceil(bucketsNeeded) - extraBuckets;

        return (int) bucketsNeeded;
    }

}
