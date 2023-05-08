import Beginig.Array.*;
import Beginig.Cycle.IsWeekend;
import Beginig.String.*;

public class Main {
    public static void main(String[] args) {
        // System.out.println(СharExpression.charExpression(5));
        // System.out.println(GetAgeDiffTask.getAgeDiff((byte) 4, (byte) 1));
        // System.out.println(PowerOfTwo.isPowerOfTwo(-2));
        // System.out.println(Factorial.factorial(6));
        //System.out.println(DetermineGroup.determineGroup(2));
        // System.out.println(IsWeekend.isWeekend("Monday"));
        // PrintArray.printArray(new int[]{1,2,3,4,5,5,6,7,7});
        // System.out.println(GetSubArrayBetween.getSubArrayBetween(new int[]{1,3,5,6,9,11,24}, 4, 10));
        // GetArrayMiddle.getArrayMiddle(new int[]{});
        // InverseArray.inverseArray(new int[]{1, 4, 6, 7});
        // MergeAndSort.mergeAndSort(new int[]{1, 3, 7, 5}, new int[]{8, 4, 2, 4});
        // PrintArray2.printArray(new int[]{1,2,3,4,5,5,6,7,7});
        // GetArrayMiddle2.getArrayMiddle(new int[]{1, 5, 2, 8, 17});
        // MergeAndSort2.mergeAndSort(new int[]{1, 3, 7, 5}, new int[]{8, 4, 2, 4});
        // PrintOddNumbers.printOddNumbers(new int[]{3,5,20,8,7,3,100});
        // ParseAndPrintNumber.parseAndPrintNumber("1200");
        // IsPalindrome.isPalindrome("Was it a cat I saw?");
        // ParseAndSqrt.parseAndSqrt("5");
        // IsGmailOrOutlook.isGmailOrOutlook("@outlook.com");
        String[] roles = new String[] {"Городничий","Аммос Федорович","Артемий Филиппович","Лука Лукич"};
        String[] textLines = new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор."
                ,"Аммос Федорович: Как ревизор?"
                ,"Артемий Филиппович: Как ревизор?"
                ,"Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем."
                ,"Аммос Федорович: Вот те на!","Артемий Филиппович: Вот не было заботы, так подай!"
                ,"Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(PrintTextPerRole.printTextPerRole(roles,textLines));

    }
}
