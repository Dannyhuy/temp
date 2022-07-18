import java.util.Scanner;

class Matrix{
    private int rows, columns;
    private int[][] element;

    public Matrix(){}

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        // this.element = new int[rows][columns];
    }
    public int getRows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }
    public int getColumns() {
        return columns;
    }
    public void setColumns(int columns) {
        this.columns = columns;
    }
    
    public void setElement(int a, int b, int c) {
        
            element[a][b] = c;
    }
    public int getElement(int a, int b) {
        return element[a][b];
    }
    
    
    
}

public class file3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nhap so dong:");
        int row = in.nextInt();
        System.out.println("Nhap so cot:");
        int col = in.nextInt();
        Matrix m = new Matrix(row, col);


        System.out.println("Nhap vitri ab giatri c:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        m.setElement(a, b, c);

        System.out.println("Nhap vitri ab:");
        int r = in.nextInt();
        int l = in.nextInt();
        System.out.println(m.getElement(r, l));

    }
}
