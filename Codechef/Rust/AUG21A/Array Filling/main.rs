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

fn gcd(a: i32, b: i32) -> i32{
    if a == 0 {
        return b;
    }
    if b == 0 {
        return a;
    }

    if a == b {
        return a;
    }

    if a > b {
        return gcd(a-b, b);
    }
    return gcd(a, b-a);
}

fn main() {
    let t: i32 = int_input();

    for _i in 0..t {
        let n_m = int_space_input();
        let n = n_m[0];
        let m: usize= n_m[1] as usize;
        
        let mut vect = Vec::new();

        for _j in 0..m {
            let x_y = int_space_input();
            vect.push(x_y);
        }

        vect.sort_by(|a, b| b.cmp(a));

        let mut lcm = 1;
        let mut rem = n;
        let mut res = 0;
        let mut iter: usize = 0;

        while iter < m && rem > 0 {
            let a = vect[iter][0];
            let b = vect[iter][1];
            let gcd = gcd(lcm, b);
            lcm = lcm*b/gcd;
            res += (rem-n/lcm)*a;
            rem = n/lcm;
            iter += 1;
        }
        
        println!("{}", res);
    }
}