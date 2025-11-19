import java.util.*;
class HashMap_Implimentation 
{
    static class HashMap<K,V>//generics-K,V no info about type
    {
        private class Node
        {
            K key;
            V val;
            public Node(K key,V val)//structure for LinkedList
            {
                this.key=key;
                this.val=val;
            }
        }
        private int n;//no of nodes
        private int N;//no of buckets
        private LinkedList<Node> bucket[];//this is my HashMap where bucket.length=N

        //@SuppressWarnings("Uncheked")
        public HashMap()
        {
            this.N=4;
            this.bucket=new LinkedList[4];
            for(int i=0;i<4;i++)
                this.bucket[i]=new LinkedList<>();//to create empty LinkedList to fill it in future
        }
        private int hashFunc(K key)
        {
            int bi=key.hashCode();
            return Math.abs(bi)%N;
        }
        private int searchInLL(K key,int bi)
        {
            LinkedList<Node> ll=bucket[bi];
            int di=0;
            for(int i=0;i<ll.size();i++)
            {
                if(ll.get(i).key==key)
                    return i;
            }
            return -1;
        }
        //@SuppressWarnings("Uncheked")
        private void rehash()
        {
            LinkedList<Node> oldBucket[]=bucket;
            bucket=new LinkedList[N*2];

            for(int i=0;i<N*2;i++)
                bucket[i]=new LinkedList<>();

            for(int i=0;i<oldBucket.length;i++)
            {
                LinkedList<Node> ll=oldBucket[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node=ll.get(j);
                    put(node.key,node.val);
                }
            }
        }
        public void put(K key,V val)
        {
            int bi=hashFunc(key);//to find bucket index to check the presence of a key
            int di=searchInLL(key,bi);//to find the data index to check its presence in a LinkedList

            if(di<0)//if present id>=0
            {
                bucket[bi].add(new Node(key,val));//add new node
                n++;
            }
            else
            {
                Node node=bucket[bi].get(di);
                node.val=val;
            }
            double lambda=(double) n/N;
            if(lambda>2.0)
                rehash();
        }
        public boolean containsKey(K key)
        {
            int bi=hashFunc(key);
            int di=searchInLL(key, bi);
            if(di<0)
                return false;
            else
                return true;    
        }
        public V get(K key)
        {
            int bi=hashFunc(key);
            int di=searchInLL(key, bi);
            if(di<0)
                return null;
            else
            {
                Node node=bucket[bi].get(di);
                return node.val;
            }
        }
        public V remove(K key)
        {
            int bi=hashFunc(key);
            int di=searchInLL(key, bi);
            if(di<0)
                return null;
            else
            {
                Node node=bucket[bi].remove(di);
                n--;
                return node.val;
            }
        }
        public ArrayList<K> keySet()
        {
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<bucket.length;i++)
            {
                LinkedList<Node> ll=bucket[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty()
        {
            return n==0;
        }
        public int size() 
        { 
            return n; 
        }
    }
    public static void main(String args[])
    {
        HashMap<String,Integer> age=new HashMap<>();

        age.put("Akash",21);
        age.put("Yash",16);
        age.put("Luv",17);
        age.put("Rishika",19);
        age.put("Harry",18);

        ArrayList<String> keys=age.keySet();
        for(int i=0;i<keys.size();i++)
            System.out.println(keys.get(i)+" -> "+age.get(keys.get(i)));

        age.remove("Akash");
        System.out.println("Akash is present? "+age.containsKey("Akash"));//false
        System.out.println("Map is empty? "+age.isEmpty());//fasle
        System.out.println("Size: "+age.size());//prints size
    }
}
