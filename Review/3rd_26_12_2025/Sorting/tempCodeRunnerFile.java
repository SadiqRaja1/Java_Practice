       for(int i= 0; i<parameterArr.length; i++) {
            int smallest = i;
            for(int j=i+1; j<parameterArr.length; j++) {
                if(parameterArr[i] < parameterArr[smallest]) {
                    smallest = j;
                }
            }
            if(parameterArr[i] != parameterArr[smallest]) {
                int temp = parameterArr[i];
                parameterArr[i] = parameterArr[smallest];
                parameterArr[smallest] = temp;
            }
        }