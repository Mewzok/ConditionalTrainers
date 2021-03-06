package ConditionalTrainers.Commands;

import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.text.format.TextStyles;

import ConditionalTrainers.Data.Player.PlayerKeys;

public class Info implements CommandExecutor
{
	@Override
	public CommandResult execute(CommandSource src, CommandContext args) throws CommandException
	{
		if(src instanceof Player)
		{
			((Player)src).offer(PlayerKeys.NPC_INFO_SEARCH, true);
			((Player)src).sendMessage(Text.of("Right click target trainer NPC"));
		}
		else
			src.sendMessages(Text.of(TextColors.RED, TextStyles.ITALIC, "This command must be run by a player."));	
		return CommandResult.success();
	}
}
