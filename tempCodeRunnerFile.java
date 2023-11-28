int s = 0;
        int e = size - 1;
        int peak=0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if((mid==0||arr[mid]>arr[mid-1])&&(mid==size-1||arr[mid]>arr[mid+1])){
                peak= mid;
                break;
            }else if(arr[mid]>arr[mid-1]&&mid>0){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return peak;
    }