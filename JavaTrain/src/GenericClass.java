 class Box <T>{
    private T content;


    public  void setContent(T content)
    {
        this.content=content;
    }
    public T getContent()
    {
        return content;
    }
    public <T> void print(T[]array)
    {
        for(T element:array)
        {
            System.out.println(element);
        }
    }
}
public class GenericClass <T> {
    public static void main(String[] args) {
        Box<Integer> integerBox=new Box<>();
        integerBox.setContent(123);
        System.out.println(integerBox.getContent());

        Box<String> stringBox=new Box<>();
        stringBox.setContent("abc");
        System.out.println(stringBox.getContent());

        Integer[] arr={1,2,3,4};
        String[] str={"abc","sada","fasfas"};
        Box obj=new Box();
        obj.print(arr);
        obj.print(str);


    }
}