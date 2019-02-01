package android.itesm.edu.pokemon;

import android.itesm.edu.pokemon.model.PokeCard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestOptions;

public class PokeCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poke_card);
        PokeCard pokeCard = (PokeCard)getIntent().getSerializableExtra("pokemon");
        loadPokemon(pokeCard);
    }
    private void loadPokemon(PokeCard pokemon){
        TextView id, name, author;
        ImageView image;
        id=findViewById(R.id.id_card);
        name= findViewById(R.id.card_name);
        author= findViewById(R.id.author_card);
        image = findViewById(R.id.card);
        RequestOptions options = new RequestOptions().centerCrop().placeholder(R.drawable.load_card).error(R.drawable.load_card);
        name.setText(pokemon.getName());
        id.setText(pokemon.getId());
        author.setText(pokemon.getAuthor());

        Glide.with(this).load(pokemon.getImageURL()).apply(options).into(image);
    }
}
