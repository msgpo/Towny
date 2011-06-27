package ca.xshade.bukkit.towny.db;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.avaje.ebean.validation.Length;
import com.avaje.ebean.validation.NotEmpty;
import com.avaje.ebean.validation.NotNull;

@Entity()
@Table(name = "towny_nations")
public class TownySQLNation {
	@Id
    private int id;

    @Length(max = 30)
    @NotEmpty
    private String name;

    @NotEmpty
    private TownySQLTown capital;
    
    @OneToMany
    private List<TownySQLResident> assistants;
    
    @NotEmpty
    private int taxes;

	
}
