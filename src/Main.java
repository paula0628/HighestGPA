public class Main
{
    public static void main(String[] args)
    {
        double GPA1 = 4.0;
        double GPA2 = 3.6;
        double GPA3 = 2.9;
        double GPA4 = 3.5;
        double GPA5 = 3.0;

        double[] GPAs = {GPA1, GPA2, GPA3, GPA4, GPA5};

        double max = find_Maximum_GPA(GPAs, 0);

        System.out.println("The maximum GPA is = " + max);
    }

    public static double find_Maximum_GPA(double[] GPAs, int index)
    {
        // Base case
        if (index == GPAs.length - 1)
        {
            return GPAs[index];
        }

        // Recursive call
        double max = find_Maximum_GPA(GPAs, index + 1);

        // Compare GPA values
        if (GPAs[index] > max)
        {
            return GPAs[index];
        }
        else
        {
            return max;
        }
    }
}