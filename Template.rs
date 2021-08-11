// 
// 
// 
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
}