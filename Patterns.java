/*class Patterns{
public static void main(String[] args){
    int m=4,n=5;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
}

class Patterns{
    public static void main(String[] args){
        int m=4,n=5;
        for(int i=1;i<=m;i++){ //outer loop
            for(int j=1;j<=n;j++){//inner loop
                if(i==1|| j==1 || i==m || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class Patterns{
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Patterns{
    public static void main(String[] args){
        int n=4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Patterns{
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

class Patterns{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}