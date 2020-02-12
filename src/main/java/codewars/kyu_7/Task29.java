package codewars.kyu_7;

/*
Mr. Scrooge has a sum of money 'P' that wants to invest, and he wants to know how many years 'Y'
this sum has to be kept in the bank in order for this sum of money to amount to 'D'.

The sum is kept for 'Y' years in the bank where interest 'I' is paid yearly,
and the new sum is re-invested yearly after paying tax 'T'

Note that the principal is not taxed but only the year's accrued interest

Example:
        Task: how many years 'Y' this sum has to be kept?
  Let P be the Principal = 1000.00 - sum of money that wants to invest
  Let I be the Interest Rate = 0.05 - paid yearly
  Let T be the Tax Rate = 0.18
  Let D be the Desired Sum = 1100.00 - sum of money to amount to achieve


After 1st Year -->
  P = 1041.00
After 2nd Year -->
  P = 1083.86
After 3rd Year -->
  P = 1128.30
Thus Mr. Scrooge has to wait for 3 years for the initial pricipal to ammount to the desired sum.

Your task is to complete the method provided and return the number of years 'Y'
as a whole in order for Mr. Scrooge to get the desired sum.

Assumptions:
Assume that Desired Principal 'D' is always greater than the initial principal,
however it is best to take into consideration that
 if the Desired Principal 'D' is equal to Principal 'P' this should return 0 Years.
 */
public class Task29 {
    public static void main(String[] args) {
        System.out.println(calculateYears(1000, 0.05, 0.18, 1100));
    }

    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int countYears = 0;

        while (principal < desired) {
            principal += principal * interest * (1 - tax);
            countYears++;
        }

        return countYears;
    }
}