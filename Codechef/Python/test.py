try:
    for i in range(1):
        n,p,k= 10, 5, 5
        n= int(n)
        p=int(p)
        k=int(k)
        ans=0
        a=p%k - 1
        print(p,"%" , k-1, "=", a)
        b=((n-1)//k)*k
        print("(", (n-1), "//", k, ")*", k, "=", b)

        print(n,"-",1,"-",b,"=",n-1-b)
        b=n-1-b
        if (a>b):
            ans+=(b+1)*((n-1)//k + 1)+ (a-b)*((n-1)//k)
        else:
            print("((",n-1,")//",k + 1,")*(",a+1,")=", ((n-1)//k + 1)*(a+1))
            print(ans, "+=", ((n-1)//k + 1)*(a+1))
            ans+=((n-1)//k + 1)*(a+1)
        for i in range(a+1,n,k):
            ans+=1
            if(i==p):
                print(ans)
                break
except:
    pass