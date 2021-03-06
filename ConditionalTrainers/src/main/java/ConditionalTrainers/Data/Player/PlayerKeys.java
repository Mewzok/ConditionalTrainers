package ConditionalTrainers.Data.Player;

import org.spongepowered.api.data.DataQuery;
import org.spongepowered.api.data.key.Key;
import org.spongepowered.api.data.value.mutable.Value;
import org.spongepowered.api.util.TypeTokens;

public class PlayerKeys
{
	private PlayerKeys() {}
	public static void dummy() {} // invoke static constructor
	public static final Key<Value<Boolean>> NPC_INFO_SEARCH;
	public static final Key<Value<Boolean>> NPC_CREATE_SEARCH;
	public static final Key<Value<Boolean>> NPC_LOAD_SEARCH;
	public static final Key<Value<Boolean>> NPC_DELETE_SEARCH;
	public static final Key<Value<String>> OBJECTIVE;
	public static final Key<Value<Integer>> VALUE;
	
	static
	{
		NPC_INFO_SEARCH = Key.builder()
				.type(TypeTokens.BOOLEAN_VALUE_TOKEN)
				.id("ConditionalTrainers:NPC__INFO_SEARCH")
				.name("NPC Info Search")
				.query(DataQuery.of('.', "conditionaltrainers.npcinfosearch"))
				.build();
		NPC_CREATE_SEARCH = Key.builder()
				.type(TypeTokens.BOOLEAN_VALUE_TOKEN)
				.id("ConditionalTrainers:NPC_CREATE_SEARCH")
				.name("NPC Create Search")
				.query(DataQuery.of('.', "conditionaltrainers.npccreatesearch"))
				.build();
		NPC_LOAD_SEARCH = Key.builder()
				.type(TypeTokens.BOOLEAN_VALUE_TOKEN)
				.id("CoditionalTrainers:NPC_LOAD_SEARCH")
				.name("NPC Load Search")
				.query(DataQuery.of('.', "conditionaltrainers.npcloadsearch"))
				.build();
		NPC_DELETE_SEARCH = Key.builder()
				.type(TypeTokens.BOOLEAN_VALUE_TOKEN)
				.id("ConditionalTrainers:NPC_DELETE_SEARCH")
				.name("NPC Delete Search")
				.query(DataQuery.of('.', "conditionaltrainers.npcdeletesearch"))
				.build();
		OBJECTIVE = Key.builder()
				.type(TypeTokens.STRING_VALUE_TOKEN)
				.id("ConditionalTrainers:OBJECTIVE")
				.name("Objective")
				.query(DataQuery.of('.', "conditionaltrainers.objective"))
				.build();
		VALUE = Key.builder()
				.type(TypeTokens.INTEGER_VALUE_TOKEN)
				.id("ConditionalTrainers:VALUE")
				.name("Value")
				.query(DataQuery.of('.', "conditionaltrainers.value"))
				.build();
	}
}
