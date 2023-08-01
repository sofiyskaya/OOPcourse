package Model;

public class ComplexNumber {

    private String complexNum = null;
    private String[] complexNumParts = new String[2];
    private double[] values = new double[] { 0, 0 };

    
    public ComplexNumber(String complexNum) {
        this.complexNum = complexNum.replace(" ", "").toLowerCase();
        parseComplexNumber();
    }

    
    public ComplexNumber(double[] complexNum) {
        values[0] = complexNum[0];
        values[1] = complexNum[1];
    }

   
    public boolean hasImagineryPart(String str) {
        return str.contains("i");
    }

    
    private boolean parseComplexNumber() {

        boolean res = true;
        String[] str;

        try {

            // checks if the complex value is begun with '-', if yes- remember & trim it
            boolean isBeginNeg = false;
            if (complexNum.charAt(0) == '-') {
                isBeginNeg = true;
                complexNum = complexNum.substring(1);
            }

            // split whole complex number string record into real & imaginery parts
            if (complexNum.contains("-")) {
                str = complexNum.split("\\-");
                // both parts are present
                if (str.length == 2) {
                    complexNumParts = str;
                    complexNumParts[1] = "-" + complexNumParts[1];
                    // one part is empty (m.b. irregular input)
                } else {
                    complexNumParts[0] = str[0];
                }
            } else if (complexNum.contains("+")) {
                str = complexNum.split("\\+");
                // both parts are present
                if (str.length == 2) {
                    complexNumParts = str;
                    // one part is empty (m.b. irregular input)
                } else {
                    complexNumParts[0] = str[0];
                }
                // one part of the number is missing
            } else {
                complexNumParts[0] = complexNum;
            }

            // adjust 1st '-' if it was
            if (isBeginNeg)
                complexNumParts[0] = "-" + complexNumParts[0];

            // saving real & imaginery parts into corresponding [0] & [1] cells of values[]
            for (int i = 0; i < 2; i++) {

                // "1.0i" in input is usually just "i" => must restore the format
                if (complexNumParts[i].equals("i")) {
                    complexNumParts[i] = "1.0i";
                } else {
                    if (complexNumParts[i].equals("-i"))
                        complexNumParts[i] = "-1.0i";
                }

                if (hasImagineryPart(complexNumParts[i])) {
                    values[1] += Double.parseDouble(complexNumParts[i].replace("i", ""));
                } else {
                    values[0] += Double.parseDouble(complexNumParts[i]);
                }
            }

        } catch (Exception e) {
            // System.out.println(e);
            res = false;
        }

        return res;
    }

    
    public double getRealPart() {
        return values[0];
    }

    
    public double getImagineryPart() {
        return values[1];
    }

    
    public boolean isNumber() {
        return (values[0] != 0 | values[1] != 0);
    }

    
    @Override
    public String toString() {
        String res = "";

        if (values[0] != 0)
            res += values[0];
        if (values[1] != 0) {
            if (res.isEmpty()) {
                res += (values[1] + "i");
            } else {
                if (values[1] > 0) {
                    res = res + " + " + values[1] + "i";
                } else {
                    res = res + " - " + (-values[1]) + "i";
                }
            }
        }
        return "(" + res + ")";
    }

}
