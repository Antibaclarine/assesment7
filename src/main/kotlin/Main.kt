fun  main() {
    var story=StoryType("animation","mary","John",50,"Childish",5)
    story.typeStory()
}
open class Ancestral(var story:String,var storyTeller:String,var translator:String){
    fun storyRoles(){
        println(story)
    }
}
class StoryType(story:String,storyTeller: String,translator: String,var length:Int,var moralLesson:String,var ageGroup:Int):Ancestral(story,storyTeller,translator){
    fun  typeStory(){
        if (length >=100 && moralLesson=="mature" && ageGroup >=10){
            println("story are for  small kids")
        }
        else{
            println("story are for older kids")
        }
    }
}