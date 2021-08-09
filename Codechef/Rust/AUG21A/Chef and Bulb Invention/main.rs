fn int_input() -> i32 {
    let mut line = String::new();
    std::io::stdin().read_line(&mut line).unwrap();
    let n: i32 = line.trim().parse().expect("invalid input");
    return n;
}

fn int_space_input() -> Vec<i32> {
    let mut vec0 = Vec::new();
    let mut line = String::new();
    std::io::stdin().read_line(&mut line).expect("input");
    let nums = line.trim().split(' ').flat_map(str::parse::<i32>).collect::<Vec<_>>();
    for num in nums {
        vec0.push(num);
    }    
    return vec0;
}


fn main() {
    let t: i32 = int_input();

    for _i in 0..t {
        let array = int_space_input();
        let n = array[0];
        let p = array[1];
        let k = array[2];
        let mut temp = 0;
        let day = (p%k) - 1;
        let mut s = ((n-1)/k)*k;
        s = n - 1 - s;
        if day > s {
            temp += (s+1)*((n-1)/k+1)+ (day-s)*((n-1)/k);
        }
        else {
            temp += ((n-1)/k+1)*(day+1); 
        }
        let mut x = day + 1; 
        while x < n {
            temp = temp + 1;
            if x == p{
                println!("{}", temp);
            }
            x = x + k;
        }
    }
}