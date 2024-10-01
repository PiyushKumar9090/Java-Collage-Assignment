
package StringBufferPackage;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer stringBuffer=new StringBuffer("Hello, World!");

        stringBuffer.append("Welcome to Java!");
        System.out.println(stringBuffer);

        stringBuffer.insert(12,"from");
        System.out.println(stringBuffer);

        stringBuffer.replace(7, 12, "Universe");
        System.out.println(stringBuffer);
        
        stringBuffer.delete(2, 5);
        System.out.println(stringBuffer);

        stringBuffer.deleteCharAt(10);
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        String result = stringBuffer.toString();
        System.out.println(result);

        int length = stringBuffer.length();
        System.out.println(length);

        int l = stringBuffer.length();
        System.out.println(l);

        int capacity = stringBuffer.capacity();      
        System.out.println(capacity);

    }
}
