package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

/*
 * Problema: 523 - Minimum Transport Cost
 * Online Judge: uva
 * Estado: Accepted 1.345
 */

public class MinimumTransportCost {
	static HashMap<Integer, ArrayList<Vertice>> vertices;
	static long[] imp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.readLine();
		boolean primero = true;
		for (int i = 0; i < n; i++) 
		{
		  StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		  int tam = st.countTokens();
		  imp = new long[tam];
		  vertices = new HashMap<Integer, ArrayList<Vertice>>();
		  for (int b = 1; b <= tam; b++) {
		   long costo = Long.parseLong(st.nextToken());
		   if (costo > 0) {
					anadirVertice(1);
					anadirVertice(b);
					anadirArista(1, b, costo);
				}
			}
	      for (int a = 2; a <= tam; a++) {
		    st = new StringTokenizer(br.readLine(), " ");
			for (int b = 1; b <= tam; b++) {
			   long costo = Long.parseLong(st.nextToken());
			   if (costo > 0) {
				 anadirVertice(a);
				 anadirVertice(b);
				 anadirArista(a, b, costo);
			   }
			 }
		  }
		  st = new StringTokenizer(br.readLine(), " ");
		  for (int j = 0; j < tam; j++)imp[j] = Integer.parseInt(st.nextToken());	
		  String s;
		  while(true)
			{
			 if((s = br.readLine())==null)System.exit(0);
			 if (s.equals("")) break;
			 st = new StringTokenizer(s, " ");
			 int from = Integer.parseInt(st.nextToken());
			 int to = Integer.parseInt(st.nextToken());
			 dijkstra(from, to, primero);
			 primero = false;
           }
		}
	}
	private static void anadirVertice(int s) {
		if (!vertices.containsKey(s)) vertices.put(s, new ArrayList<Vertice>());
	}
	private static void anadirArista(int from, int to, long costo) {
		vertices.get(from).add(new Vertice(from, to, costo));
	}
	private static void dijkstra(int a, int b, boolean primero) {
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
œ		PriorityQueue<Vertice> pq = new PriorityQueue<Vertice>();
		HashMap<Integer, Vertice> res = new HashMap<Integer, Vertice>();
		Vertice vert = new Vertice(a, a, 0);
		if (!primero) pw.println();
		pq.add(vert);
		res.put(a, vert);
		while (!pq.isEmpty()) {
			Vertice v = pq.poll();
			ArrayList<Vertice> arists = vertices.get(v.to);
			for (int i = 0; i < arists.size(); i++) {
				Vertice v1 = arists.get(i);
				long c = v.costo + v1.costo;
				if (v1.to != a && v1.to != b)
					c += imp[v1.to - 1];
				if (res.containsKey(v1.to)) {
					Vertice v2 = res.get(v1.to);
					if (c < v2.costo) {
						v2.setCosto(c);
						v2.setFrom(v1.from);
						pq.add(v2);
					}
				} else {
					vert = new Vertice(v1.from, v1.to, c);
					pq.add(vert);
					res.put(v1.to, vert);
				}
			}
		}
     
		Stack<String> r = new Stack<String>();
		vert = res.get(b);
		long costo = vert.costo;
		r.push("" + b);
		while (vert.from != a) {
		  r.push("" + vert.from);
		  vert = res.get(vert.from);
		}
		r.push("" + a);
		pw.println("From " + a + " to " + b + " :");
		pw.print("Path: ");
		while (!r.isEmpty()) {
		  String s = r.pop();
		  if (r.isEmpty())pw.println(s);
		  else pw.print(s + "-->");
		}
		pw.println("Total cost : " + costo);

		pw.flush();
	}
	static class Vertice implements Comparable<Vertice>
	{
		int from;
		int to;
		long costo;
		public Vertice(int from, int to, long costo) {
			this.from = from;
			this.to = to;
			this.costo = costo;
		}
		public Vertice(int from, int to) {
			this.from = from;
			this.to = to;
		}
		@Override
		public int compareTo(Vertice v) {
			if (costo > v.costo)
				return 1;
			return -1;
		}
		public void setCosto(long c) {
		 costo = c;
		}
		public void setFrom(int f) {
			from = f;
		}
	}
}
