FirstClass firstClass = new FirstClass(1, "Name", "2@mail.ru", "ml")
println firstClass
Binding binding = new Binding()
binding.setVariable("firstClass", new FirstClass(2, "Robert", "3@mail.ru", "dev"))
println binding.getProperty("firstClass")

println firstClass.getId()
println firstClass.getName()
println firstClass.getEmail()
println firstClass.getPosition()

def a = 7
def b = "seven"
println a + " " + b
println String instanceof Integer

Integer num = firstClass.calc(2)
println num

