package com.company;

import java.util.*;

public class TSP{

    static int n; // Number of cities
    static int[][] dist; // Distance matrix
    static int minCost = Integer.MAX_VALUE; // Minimum cost found

    // Function to calculate cost of current path
    static void tsp(List<Integer> cities) {
        int cost = 0;
        int prev = 0; // start from city 0

        for (int city : cities) {
            cost += dist[prev][city];
            prev = city;
        }
        cost += dist[prev][0]; // return to start

        minCost = Math.min(minCost, cost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        dist = new int[n][n];

        // Read distance matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = sc.nextInt();
            }
        }

        List<Integer> cities = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            cities.add(i); // add cities 1 to n-1 (0 is the start city)
        }

        // Generate all permutations of cities
        permute(cities, 0);

        System.out.println("Minimum cost: " + minCost);
    }

    // Function to generate permutations
    static void permute(List<Integer> cities, int l) {
        if (l == cities.size()) {
            tsp(cities);
            return;
        }

        for (int i = l; i < cities.size(); i++) {
            Collections.swap(cities, i, l);
            permute(cities, l + 1);
            Collections.swap(cities, i, l);
        }
    }
}
