package labki8;

public class Threads {

	private static final int NUM_THREADS = 3;
	 
    private static final class Worker implements Runnable {
 
        private Matrix m;
        private Vector v;
        private Vector result;
        private int from;
        private int to;
 
        public Worker(Matrix m, Vector v, Vector result, int from, int to) {
            this.m = m;
            this.v = v;
            this.result = result;
            this.from = from;
            this.to = to;
        }
 
        @Override
        public void run() {
        	result.MultiplayMatrixAndVectorOneRow(m, v, from, to);
            System.out.println(String.format("Thread %d-%d done.", from, to));
        	
        }
    }
 
    public static Vector threaded_multiply(Matrix m, Vector v) {
        Vector result = new Vector(m.getSize());
    	if(v.ifEqualVectorVsMatrix(m)==true)

        {
        Thread[] threads = new Thread[NUM_THREADS];
        int x = m.getSize() / NUM_THREADS;
        for(int i = 0; i < NUM_THREADS - 1; ++i)
            threads[i] = new Thread(new Worker(m, v, result, x * i, x * i + x));
        threads[NUM_THREADS - 1] = new Thread(new Worker(m, v, result, x * (NUM_THREADS - 1), m.getSize()));
        for(Thread t : threads)
            t.start();
        for(Thread t : threads)
            while(t.isAlive()) {
                try {
                    t.join();
                } catch(InterruptedException ignored) {
                }
            }
        return result;}
        else return null;
    }
 
    public static void main(String[] args) {
        Matrix m = new Matrix(10);
        System.out.println("Matrix:\n" + m);
        Vector v = new Vector(10);
        v.show();
        Vector vresult = new Vector(v);
        vresult = threaded_multiply(m, v);
        System.out.println("Multiplied:\n");
        vresult.show();
    }
	
}
