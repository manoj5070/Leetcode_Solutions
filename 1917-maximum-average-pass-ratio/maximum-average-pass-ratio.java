class Solution {
    public double maxAverageRatio(int[][] classes, int extra) {
        double sum=0;
        int n=classes.length;

        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for(int i=0;i<n;i++){
            double temp1=(classes[i][0]/(double)classes[i][1]);
            double temp2=((classes[i][0]+1)/(double)(classes[i][1]+1));
            temp1=temp2-temp1;
            temp1=Math.round(temp1*100000.0)/100000.0;
            double[] arr=new double[2];
            arr[0]=temp1;
            arr[1]=i;
            pq.add(arr);            
        }


        while(extra-->0){       
            double[] arr=pq.poll();
            int maxdiffInd=(int)arr[1];
            int pass = classes[maxdiffInd][0];
            int total = classes[maxdiffInd][1];
            classes[maxdiffInd][0]++;
            classes[maxdiffInd][1]++;
            double newGain = ((pass + 2) /(double)(total+2))-((pass + 1) / (double)(total + 1));
            arr[0] = newGain;
            pq.add(arr);
        }
        for(int i=0;i<n;i++){
            double temp1=(classes[i][0]/(double)classes[i][1]);
            temp1=Math.round(temp1*100000.0)/100000.0;
            sum+=temp1;
        }
        return sum/classes.length;
    }
}