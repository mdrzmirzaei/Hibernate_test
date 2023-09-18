package org.hbn;

public class ncValidate {
    static int controlDigit;
    static int sum = 0;
    static Float mod_result = 0.0f;

    public static boolean validate(String nationalCode) {
        if (nationalCode.trim().length() != 10) {
            System.out.println("the number of NationalCode length is not valid!!!");
            return false;
        }

        controlDigit = Integer.parseInt(nationalCode.substring(9));
        System.out.println("this is control digit : " + controlDigit);

        for (int i = 0; i < 9; i++) {
            sum += Integer.parseInt(nationalCode.substring(i, i + 1)) * (10 - i);
        }
        mod_result = (float) sum % 11;
        System.out.println("moderesult is  " + mod_result);

        if (mod_result < 2 && controlDigit == mod_result) return true;
        else return (11 - mod_result) == controlDigit;

    }

}
