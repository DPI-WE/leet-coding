# Ruby
Enter `bundle install` in the terminal to install dependencies. 

You can run the tests by file eg `ruby tests/test_sum.rb` and `minitest/autorun` will run all the tests in the file. You can also run all ruby tests with `ruby tests/*.rb`. It will output the results of your tests.

```bash
Run options: --seed 41419

# Running:

..

Finished in 0.000399s, 5012.5312 runs/s, 5012.5312 assertions/s.
2 runs, 2 assertions, 0 failures, 0 errors, 0 skips
```

## Debugging
You can use the [debug](https://github.com/ruby/debug) gem to create breakpoints.

```ruby
require 'debug' # import debug gem

def sum(a, b)
  debugger # create a breakpoint
  return a + b
end
```