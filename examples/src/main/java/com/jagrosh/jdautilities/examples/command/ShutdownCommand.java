/*
 * Copyright 2016-2018 John Grosh (jagrosh) & Kaidan Gustave (TheMonitorLizard)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jagrosh.jdautilities.examples.command;

import com.bradeurs.jdautilities.command.Command;
import com.bradeurs.jdautilities.command.CommandEvent;
import com.jagrosh.jdautilities.doc.standard.CommandInfo;
import com.jagrosh.jdautilities.examples.doc.Author;

/**
 *
 * @author John Grosh (jagrosh)
 */
@CommandInfo(
    name = "Shutdown",
    description = "Safely shuts down the bot."
)
@Author("John Grosh (jagrosh)")
public class ShutdownCommand extends Command {

    public ShutdownCommand()
    {
        this.name = "shutdown";
        this.help = "safely shuts off the bot";
        this.guildOnly = false;
        this.ownerCommand = true;
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reactWarning();
        event.getJDA().shutdown();
    }
    
}
