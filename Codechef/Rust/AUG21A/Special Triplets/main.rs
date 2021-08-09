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
            
            // for b in 2..n+1 {

                // if b != a {
                    // let c = a % b;
                    // println!("Checking = ({},{},{})", a, b, c);
                    // if c != 0 {
                        // if b % c == 0 {
                            // println!("({},{},{})", a, b, c);
                            // count += 1;
                        // }
                    // }
                // }
            }
        }
        println!("{}", count);
        println!("_________________________");
        println!("_________________________");
    }
}