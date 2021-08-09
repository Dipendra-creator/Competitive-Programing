fn int_input() -> i64 {
    let mut line = String::new();
    std::io::stdin().read_line(&mut line).unwrap();
    let n: i64 = line.trim().parse().expect("invalid input");
    return n;
}


fn main() {
    let t: i64 = int_input();

    for _e in 0..t {
        let n: i64 = int_input();
        let mut count = 0;
        for a in 1..n+1 {
            let mut b = a;
            while b <= n {
                println!("for (int b={}; b<= {}; b += {})", a, n, a);
                if b%a == 0 {
                    let mut c = a;
                    while c <= n {
                        if c%b == a {
                            count += 1
                        }
                        c += b;
                    }
                }
                b += a;
            }
        }
        println!("{}", count);
    }
}