package co.comss.sqliteagenda;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
/**
 * Created by Admin on 24/10/2016.
 */

public class ContactosSQLite extends SQLiteOpenHelper {

    String sqlCreate = "CREATE TABlE Contacts (" +
            "id         INTEGER PRIMARY KEY AUTOINCREMENT," +
            "nombre     TEXT," +
            "telefono   INTEGER," +
            "correo     TEXT)";

    public ContactosSQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS Contacts");
        db.execSQL(sqlCreate);
    }
}

// End Of Code