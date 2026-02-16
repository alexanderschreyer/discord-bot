package modules.lmsr.listener;

import modules.lmsr.logic.CourseSelector;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class LmsrListener extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("tours")) {
            if (event.getOption("include-dlc") != null) {
                boolean option = event.getOption("include-dlc").getAsBoolean();
                say(event, option);
            } else {
                say(event, false);
            }
        }
    }

    private void say(SlashCommandInteractionEvent event, boolean dlcIncluded) {
        CourseSelector courseSelector = new CourseSelector();
        courseSelector.setIncludeDlc(dlcIncluded);
        String feedback = courseSelector.getCoursesInRandomOrder();
        event.reply(feedback).queue();
    }
}