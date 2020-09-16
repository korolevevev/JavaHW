package Sem2;

public final class gTask1_Matrix {
    public static class Matrix
    {
        public int[][] _matrix;
        public Matrix(int[][] matrix)
        {
            _matrix = matrix;
        }

        public enum Methods {
            Add,
            Sub,
            Mult,
            MultByNumber,
            Transpos,
            Exp
        }

        public static void print(Matrix m)
        {
            for (int i = 0; i < m._matrix.length; i++) {
                for (int j = 0; j < m._matrix[i].length; j++) {
                    System.out.print(m._matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    public static Matrix Operation(Matrix m1, Matrix m2, Matrix.Methods methodName) throws Exception {
        Matrix matrix_out = new Matrix(new int[m1._matrix.length][m2._matrix[0].length]);

        for (int i = 0; i < m1._matrix.length; i++) {
            for (int j = 0; j < m2._matrix[0].length; j++) {

                switch (methodName) {
                    case Add:
                        matrix_out._matrix[i][j] = m1._matrix[i][j] + m2._matrix[i][j];
                        break;
                    case Sub:
                        matrix_out._matrix[i][j] = m1._matrix[i][j] - m2._matrix[i][j];
                        break;
                    case Mult:
                        for (int k = 0; k < m1._matrix[i].length; k++)
                            matrix_out._matrix[i][j] += m1._matrix[i][k] * m2._matrix[k][j];
                        break;
                    default:
                        throw new Exception("Метод " + methodName + " не допустим в данном контексте.");
                }

            }
        }

        return matrix_out;
    }


    public static Matrix Operation(Matrix m, int number, Matrix.Methods methodName) throws Exception
    {
        Matrix matrix_out = new Matrix(new int[m._matrix.length][m._matrix[0].length]);

        for (int i = 0; i < m._matrix.length; i++) {
            for (int j = 0; j < m._matrix[i].length; j++) {

                switch (methodName) {
                    case MultByNumber:
                        matrix_out._matrix[i][j] = m._matrix[i][j] * number;
                        break;
                    case Exp:
                        matrix_out = m;
                        for (int n = 2; n <= number; n++)
                            matrix_out = Operation(m, matrix_out, Matrix.Methods.Mult);
                        return matrix_out;
                    default:
                        throw new Exception("Метод " + methodName + " не допустим в данном контексте.");
                }

            }
        }

        return matrix_out;
    }

    public static Matrix Operation(Matrix m, Matrix.Methods methodName) throws Exception {
        Matrix matrix_out = new Matrix(new int[m._matrix[0].length][m._matrix.length]);

        for (int i = 0; i < m._matrix.length; i++) {
            for (int j = 0; j < m._matrix[i].length; j++) {

                switch (methodName) {
                    case Transpos -> matrix_out._matrix[j][i] = m._matrix[i][j];
                    default -> throw new Exception("Метод " + methodName + " не допустим в данном контексте.");
                }

            }
        }

        return matrix_out;
    }

    public static void main(String[] args) throws Exception {
        Task1_Matrix.Matrix m1 = new Task1_Matrix.Matrix(new int[][]{{1,2},{3,4}});
        Task1_Matrix.Matrix m2 = new Task1_Matrix.Matrix(new int[][]{{5,6},{7,8}});

        Task1_Matrix.Matrix m3 = new Task1_Matrix.Matrix(new int[][]{{5,6,7},{2,4,8}});
        Task1_Matrix.Matrix m4 = new Task1_Matrix.Matrix(new int[][]{{1,2},{3,7},{6,0}});

        // Сложение двух матриц
        System.out.println("Сложение двух матриц");
        Task1_Matrix.Matrix.print(Task1_Matrix.Operation(m1, m2, Task1_Matrix.Matrix.Methods.Add));

        // Вычитание двух матриц
        System.out.println("Вычитание двух матриц");
        Task1_Matrix.Matrix.print(Task1_Matrix.Operation(m1, m2, Task1_Matrix.Matrix.Methods.Sub));

        // Умножение матрицы на число
        System.out.println("Умножение матрицы на число");
        Task1_Matrix.Matrix.print(Task1_Matrix.Operation(m1, 4, Task1_Matrix.Matrix.Methods.MultByNumber));

        // Умножение матриц
        System.out.println("Умножение матриц");
        Task1_Matrix.Matrix.print(Task1_Matrix.Operation(m3, m4, Task1_Matrix.Matrix.Methods.Mult));

        // Транспонирование матрицы
        System.out.println("Транспонирование матрицы");
        Task1_Matrix.Matrix.print(Task1_Matrix.Operation(m3, Task1_Matrix.Matrix.Methods.Transpos));

        // Возведение матрицы в степень
        System.out.println("Возведение матрицы в степень (где степень - целое число, больше 1)");
        Task1_Matrix.Matrix.print(Task1_Matrix.Operation(m1, 3, Task1_Matrix.Matrix.Methods.Exp));

    }
}