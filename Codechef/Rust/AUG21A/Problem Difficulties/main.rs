use std::collections::HashSet;

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
        let mut array = int_space_input();

        let hash_set: HashSet<i32> = array.iter().cloned().collect();

        let final_array: Vec<&i32> = hash_set.iter().collect();

        let len_of_set = final_array.len();

        if len_of_set == 4 {
            println!("{}", '2');
        }
        else if len_of_set == 3 {
            println!("{}", '2');
        }
        else if len_of_set == 2 {
            array.sort();
            let b = array[0];
            if array.iter().filter(|&n| *n == b).count() == 2 {
                println!("{}", '2');
            }
            else {
                println!("{}", '1');
            }
        }
        else if len_of_set == 1 {
            println!("{}", '0');
        }
        else {
            println!("{}", '0');
        }
        
    }
}