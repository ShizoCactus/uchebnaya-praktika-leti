fun main(args: Array<String>) {
    if (args.isNotEmpty())
        Solution(args[0], args[1], args[2]).solve()
    else
        throw exceptions.NotEnoughArgumentsException()
}