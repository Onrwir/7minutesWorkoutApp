package pl.onrwir.a7minutesworkoutapp

class ExerciseModel (
    private var id: Int,
    private var name: String,
    private var image: Int,
    private var isCompleted: Boolean,
    private var isSelected: Boolean
){
    fun getId() : Int{
        return id
    }

    fun setID(id: Int){
        this.id = id
    }

    fun getName() : String{
        return name
    }

    fun setID(name: String){
        this.name = name
    }

    fun getImage() : Int{
        return image
    }

    fun setImage(image: Int){
        this.image = image
    }

    fun getIsComplete() : Boolean{
        return isCompleted
    }

    fun setIsComplete(isCompleted: Boolean){
        this.isCompleted = isCompleted
    }

    fun getIsSelected() : Boolean{
        return isSelected
    }

    fun setIsSelected(isSelected: Boolean){
        this.isSelected = isSelected
    }
}