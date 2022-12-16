package main
import ("fmt"
        "strconv"
        )
func main() {
    var numTests int
    fmt.Scan(&numTests)
    
    for i := 0; i < numTests; i++ {
        var input string
        var produced string

        fmt.Scan(&input)
        fmt.Scan(&produced)
        fmt.Printf("Case #%d: %s \n", i+1, corrector(input, produced))
        }
}

func corrector(input string, produced string) string{
    if len(input)>len(produced){
            return "IMPOSSIBLE"
        }
    N := len(input)
    M := len(produced)
    pointer1 := 0
    pointer2 := 0
    
    for pointer1<N && pointer2<M {
        if input[pointer1]==produced[pointer2]{
            pointer1= pointer1 + 1
            pointer2= pointer2 + 1
        }else{
            pointer2= pointer2 + 1
        }
    }
    
    if pointer1==N{
        return strconv.Itoa(M-N)
    }
    return "IMPOSSIBLE"
}
