/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Input Matrix A
            System.out.print("Enter rows and cols for Matrix A: ");
            int rA = sc.nextInt();
            int cA = sc.nextInt();

            int[][] A = new int[rA][cA];

            System.out.println("Enter elements of Matrix A:");
            for (int i = 0; i < rA; i++) {
                for (int j = 0; j < cA; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            // Input Matrix B
            System.out.print("Enter rows and cols for Matrix B: ");
            int rB = sc.nextInt();
            int cB = sc.nextInt();

            int[][] B = new int[rB][cB];

            System.out.println("Enter elements of Matrix B:");
            for (int i = 0; i < rB; i++) {
                for (int j = 0; j < cB; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            // Multiply matrices
            int[][] result = Problem2_MatrixMultiplication.multiplyMatrices(A, B);

            // Display result
            System.out.println("Resulting Matrix:");

            for (int[] row : result) {
                System.out.println(Arrays.toString(row));
            }

        } catch (MatrixMismatchException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            sc.close();
        }
    }
