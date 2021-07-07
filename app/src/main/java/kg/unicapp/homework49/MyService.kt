package kg.unicapp.homework49

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast

class MyService : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        for (i in 1..10) {
            Log.d("TAG", "Считаем до: $i")
            Thread.sleep(1000)
        }
        stopSelf()
        return super.onStartCommand(intent, flags, startId)
    }
    override fun onDestroy() {
        Toast.makeText(this, "СЕРВИС ОСТАНОВЛЕН", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}