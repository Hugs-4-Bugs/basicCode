Arrays.sort(arr);
    int maxDistance = arr[0];
    for(int i = 1; i < arr.length; i++){
        int distance = (arr[i] - arr[i-1]) / 2;
        if(maxDistance < distance) maxDistance = distance;
    }
    int lastGap = (n-1) - arr[arr.length - 1];
    return (lastGap < maxDistance) ? maxDistance : lastGap;
    
    
    
    
    //flat space station
    //https://www.hackerrank.com/challenges/flatland-space-stations/problem
