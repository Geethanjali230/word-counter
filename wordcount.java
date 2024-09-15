public class wordcount {
    public static void main(String args[]){
        int count=0;
        String v="Everyone knows that paper is made from trees. But when one looks at trees one cannot imagine that something so soft and fragile as the paper is made is so hard and strong. Plant materials such as wood are made of fibres known as cellulose. It is the primary ingredient in paper making. Raw wood is first converted into pulp consisting of a mixture of Cellulose, lignin, water and some chemicals. The pulp can be made mechanically through grinders or through chemical processes. Short fibres are produced by mechanical grinding. The paper produced in this way is weak and is used to make newspapers, magazines and phonebooks.";
        String r[]=v.split(" ");
        for(int i=0;i<r.length;i++){
       
       count+=1;
    }
    int s=500-count;
    int p=count-500;
    if(count==500){
        System.out.println("the essay is accepted");
    }
    else if(count<500){
        System.out.println("The count is"+" "+count+" "+"The count of words is insufficient .So you need to add"+" "+s+" "+"words to complete your essay");
    }
    else if(count>500){
        System.out.println("The count is"+" "+count+" "+"The count of words is more .So you need to remove"+" "+p+" "+"words to make your essay accepted");
    }
    
}
}