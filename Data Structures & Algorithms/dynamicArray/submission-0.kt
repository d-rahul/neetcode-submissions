class DynamicArray(capacity: Int) {
    private var mCapacity = capacity
    private var mSize = 0
    var list = ArrayList<Int>(mCapacity)

    fun get(i: Int): Int {
        return list[i]
    }

    fun set(i: Int, n: Int) {
        list[i] = n
    }

    fun pushback(n: Int) {
        if (mSize == mCapacity) {
            resize()
        }
        mSize += 1
        list.add(n)
    }

    fun popback(): Int {
        mSize -= 1
        return list[mSize]
    }

    private fun resize() {
        mCapacity = if (mCapacity == 0) 1 else mCapacity * 2
        list.ensureCapacity(mCapacity)
    }

    fun getSize(): Int {
        return mSize
    }

    fun getCapacity(): Int {
        return mCapacity
    }
}
