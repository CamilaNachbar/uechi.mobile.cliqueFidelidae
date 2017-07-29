package cliquefidelidade.mobile.uechi.cliquefidelidade.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Camila Nachbar on 7/29/2017.
 */

public class UsuarioDAO extends SQLiteOpenHelper{
    public UsuarioDAO(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "cliqueFidelidade", factory, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlCreateTable = "CREATE TABLE Usuario (idUsuario INTEGER NOT NULL,name TEXT NOT NULL, email TEXT NOT NULL,password TEXT NOT NULL,cpf TEXT NOT NULL,celphone TEXT NULL);";
        sqLiteDatabase.execSQL(sqlCreateTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void findBykey(SQLiteDatabase sqLiteDatabase){

    }
}
