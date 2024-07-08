require 'minitest/autorun'
require_relative '../sum'

class TestSum < Minitest::Test
  def test_sum_zero
    assert_equal 0, sum(0, 0)
  end

  def test_sum_three
    assert_equal 3, sum(1,2)
  end
end
