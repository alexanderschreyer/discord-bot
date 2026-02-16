import modules.lmsr.listener.LmsrListener;
import io.TokenReader;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.interactions.IntegrationType;
import net.dv8tion.jda.api.interactions.InteractionContextType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;

import java.util.EnumSet;

import static net.dv8tion.jda.api.interactions.commands.OptionType.BOOLEAN;

public class Bot {

    public static void main(String[] args) {
        String token = System.getenv("DISCORD_TOKEN");

        EnumSet<GatewayIntent> intents = EnumSet.noneOf(GatewayIntent.class);
        JDA api = JDABuilder.createLight(token, intents)
                .addEventListeners(new LmsrListener())
                .build();

        handleCommands(api);
    }

    private static void handleCommands(JDA api) {
        CommandListUpdateAction commands = api.updateCommands();

        commands.addCommands(Commands.slash("tours", "Generates a random list of tours for Lonely Mountains: Snow Riders")
                .setContexts(InteractionContextType.ALL)
                .setIntegrationTypes(IntegrationType.ALL)
                .addOption(BOOLEAN, "include-dlc", "Enter 'false' for base game only or 'true' to include dlc courses", true));

        commands.queue();
    }
}