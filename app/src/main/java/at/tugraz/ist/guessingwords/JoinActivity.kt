package at.tugraz.ist.guessingwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)
        customizeActionBar()
    }

    private fun customizeActionBar() {
        supportActionBar?.title = getString(R.string.gameplay)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return true
    }
}