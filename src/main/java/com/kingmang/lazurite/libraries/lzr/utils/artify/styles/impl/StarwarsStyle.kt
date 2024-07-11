package com.kingmang.lazurite.libraries.lzr.utils.artify.styles.impl

import com.kingmang.lazurite.libraries.lzr.utils.artify.styles.IArtifyStyle

class StarwarsStyle : IArtifyStyle {

    override val styleName: String
        get() = "starwars"

    override fun getArtMap(): Map<Char, String> {
        return mapOf(
            'A' to """
                     ___      
                    /   \     
                   /  ^  \    
                  /  /_\  \   
                 /  _____  \  
                /__/     \__\ 
                              
            """.trimIndent(),

            'B' to """
                .______   
                |   _  \  
                |  |_)  | 
                |   _  <  
                |  |_)  | 
                |______/  
                          
            """.trimIndent(),

            'C' to """
                  ______ 
                 /      |
                |  ,----'
                |  |     
                |  `----.
                 \______|
                         
            """.trimIndent(),

            'D' to """
                 _______  
                |       \ 
                |  .--.  |
                |  |  |  |
                |  '--'  |
                |_______/ 
                          
            """.trimIndent(),

            'E' to """
                 _______ 
                |   ____|
                |  |__   
                |   __|  
                |  |____ 
                |_______|
                         
            """.trimIndent(),

            'F' to """
                 _______ 
                |   ____|
                |  |__   
                |   __|  
                |  |     
                |__|     
                         
            """.trimIndent(),

            'G' to """
                  _______ 
                 /  _____|
                |  |  __  
                |  | |_ | 
                |  |__| | 
                 \______| 
                          
            """.trimIndent(),

            'H' to """
                 __    __  
                |  |  |  | 
                |  |__|  | 
                |   __   | 
                |  |  |  | 
                |__|  |__| 
                           
            """.trimIndent(),

            'I' to """
                 __  
                |  | 
                |  | 
                |  | 
                |  | 
                |__| 
                     
            """.trimIndent(),

            'J' to """
                       __  
                      |  | 
                      |  | 
                .--.  |  | 
                |  `--'  | 
                 \______/  
                           
            """.trimIndent(),

            'K' to """
                 __  ___ 
                |  |/  / 
                |  '  /  
                |    <   
                |  .  \  
                |__|\__\ 
                         
            """.trimIndent(),

            'L' to """
                 __      
                |  |     
                |  |     
                |  |     
                |  `----.
                |_______|
                         
            """.trimIndent(),

            'M' to """
                .___  ___. 
                |   \/   | 
                |  \  /  | 
                |  |\/|  | 
                |  |  |  | 
                |__|  |__| 
                           
            """.trimIndent(),

            'N' to """
                .__   __. 
                |  \ |  | 
                |   \|  | 
                |  . `  | 
                |  |\   | 
                |__| \__| 
                          
            """.trimIndent(),

            'O' to """
                  ______   
                 /  __  \  
                |  |  |  | 
                |  |  |  | 
                |  `--'  | 
                 \______/  
                           
            """.trimIndent(),

            'P' to """
                .______   
                |   _  \  
                |  |_)  | 
                |   ___/  
                |  |      
                | _|      
                          
            """.trimIndent(),

            'Q' to """
                  ______      
                 /  __  \     
                |  |  |  |    
                |  |  |  |    
                |  `--'  '--. 
                 \_____\_____\
                              
            """.trimIndent(),

            'R' to """
                .______      
                |   _  \     
                |  |_)  |    
                |      /     
                |  |\  \----.
                | _| `._____|
                             
            """.trimIndent(),

            'S' to """
                     _______.
                    /       |
                   |   (----`
                    \   \    
                .----)   |   
                |_______/    
                             
            """.trimIndent(),

            'T' to """
                .___________.
                |           |
                `---|  |----`
                    |  |     
                    |  |     
                    |__|     
                             
            """.trimIndent(),

            'U' to """
                 __    __  
                |  |  |  | 
                |  |  |  | 
                |  |  |  | 
                |  `--'  | 
                 \______/  
                           
            """.trimIndent(),

            'V' to """
                ____    ____ 
                \   \  /   / 
                 \   \/   /  
                  \      /   
                   \    /    
                    \__/     
                             
            """.trimIndent(),

            'W' to """
                ____    __    ____ 
                \   \  /  \  /   / 
                 \   \/    \/   /  
                  \            /   
                   \    /\    /    
                    \__/  \__/     
                                   
            """.trimIndent(),

            'X' to """
                ___   ___ 
                \  \ /  / 
                 \  V  /  
                  >   <   
                 /  .  \  
                /__/ \__\ 
                          
            """.trimIndent(),

            'Y' to """
                ____    ____ 
                \   \  /   / 
                 \   \/   /  
                  \_    _/   
                    |  |     
                    |__|     
                             
            """.trimIndent(),

            'Z' to """
                 ________  
                |       /  
                `---/  /   
                   /  /    
                  /  /----.
                 /________|
                           
            """.trimIndent(),

            'a' to """
                     ___      
                    /   \     
                   /  ^  \    
                  /  /_\  \   
                 /  _____  \  
                /__/     \__\ 
                              
            """.trimIndent(),

            'b' to """
                .______   
                |   _  \  
                |  |_)  | 
                |   _  <  
                |  |_)  | 
                |______/  
                          
            """.trimIndent(),

            'c' to """
                  ______ 
                 /      |
                |  ,----'
                |  |     
                |  `----.
                 \______|
                         
            """.trimIndent(),

            'd' to """
                 _______  
                |       \ 
                |  .--.  |
                |  |  |  |
                |  '--'  |
                |_______/ 
                          
            """.trimIndent(),

            'e' to """
                 _______ 
                |   ____|
                |  |__   
                |   __|  
                |  |____ 
                |_______|
                         
            """.trimIndent(),

            'f' to """
                 _______ 
                |   ____|
                |  |__   
                |   __|  
                |  |     
                |__|     
                         
            """.trimIndent(),

            'g' to """
                  _______ 
                 /  _____|
                |  |  __  
                |  | |_ | 
                |  |__| | 
                 \______| 
                          
            """.trimIndent(),

            'h' to """
                 __    __  
                |  |  |  | 
                |  |__|  | 
                |   __   | 
                |  |  |  | 
                |__|  |__| 
                           
            """.trimIndent(),

            'i' to """
                 __  
                |  | 
                |  | 
                |  | 
                |  | 
                |__| 
                     
            """.trimIndent(),

            'j' to """
                       __  
                      |  | 
                      |  | 
                .--.  |  | 
                |  `--'  | 
                 \______/  
                           
            """.trimIndent(),

            'k' to """
                 __  ___ 
                |  |/  / 
                |  '  /  
                |    <   
                |  .  \  
                |__|\__\ 
                         
            """.trimIndent(),

            'l' to """
                 __      
                |  |     
                |  |     
                |  |     
                |  `----.
                |_______|
                         
            """.trimIndent(),

            'm' to """
                .___  ___. 
                |   \/   | 
                |  \  /  | 
                |  |\/|  | 
                |  |  |  | 
                |__|  |__| 
                           
            """.trimIndent(),

            'n' to """
                .__   __. 
                |  \ |  | 
                |   \|  | 
                |  . `  | 
                |  |\   | 
                |__| \__| 
                          
            """.trimIndent(),

            'o' to """
                  ______   
                 /  __  \  
                |  |  |  | 
                |  |  |  | 
                |  `--'  | 
                 \______/  
                           
            """.trimIndent(),

            'p' to """
                .______   
                |   _  \  
                |  |_)  | 
                |   ___/  
                |  |      
                | _|      
                          
            """.trimIndent(),

            'q' to """
                  ______      
                 /  __  \     
                |  |  |  |    
                |  |  |  |    
                |  `--'  '--. 
                 \_____\_____\
                              
            """.trimIndent(),

            'r' to """
                .______      
                |   _  \     
                |  |_)  |    
                |      /     
                |  |\  \----.
                | _| `._____|
                             
            """.trimIndent(),

            's' to """
                     _______.
                    /       |
                   |   (----`
                    \   \    
                .----)   |   
                |_______/    
                             
            """.trimIndent(),

            't' to """
                .___________.
                |           |
                `---|  |----`
                    |  |     
                    |  |     
                    |__|     
                             
            """.trimIndent(),

            'u' to """
                 __    __  
                |  |  |  | 
                |  |  |  | 
                |  |  |  | 
                |  `--'  | 
                 \______/  
                           
            """.trimIndent(),

            'v' to """
                ____    ____ 
                \   \  /   / 
                 \   \/   /  
                  \      /   
                   \    /    
                    \__/     
                             
            """.trimIndent(),

            'w' to """
                ____    __    ____ 
                \   \  /  \  /   / 
                 \   \/    \/   /  
                  \            /   
                   \    /\    /    
                    \__/  \__/     
                                   
            """.trimIndent(),

            'x' to """
                ___   ___ 
                \  \ /  / 
                 \  V  /  
                  >   <   
                 /  .  \  
                /__/ \__\ 
                          
            """.trimIndent(),

            'y' to """
                ____    ____ 
                \   \  /   / 
                 \   \/   /  
                  \_    _/   
                    |  |     
                    |__|     
                             
            """.trimIndent(),

            'z' to """
                 ________  
                |       /  
                `---/  /   
                   /  /    
                  /  /----.
                 /________|
                           
            """.trimIndent(),

            ' ' to """
                   
                   
                   
                   
                   
                   
                   
            """.trimIndent(),

            '@' to """
                   ____  
                  / __ \ 
                 / / _` |
                | | (_| |
                 \ \__,_|
                  \____/ 
                         
            """.trimIndent(),

            '#' to """
                   _  _   
                 _| || |_ 
                |_  __  _|
                 _| || |_ 
                |_  __  _|
                  |_||_|  
                          
            """.trimIndent(),

            '$' to """
                     __,--,_.
                    /       |
                   |   (----`
                    \   \    
                .----)   |   
                |_    __/    
                  '--'       
            """.trimIndent(),

            '%' to """
                  _     ___  
                 / \   /  /  
                ( o ) /  /   
                 \_/ /  / _  
                    /  / / \ 
                   /  / ( o )
                  /__/   \_/ 
            """.trimIndent(),

            '^' to """
                  ___  
                 /   \ 
                /--^--\
                       
                       
                       
                       
            """.trimIndent(),

            '&' to """
                        
                  ___   
                 ( _ )  
                 / _ \/\
                | (_>  <
                 \___/\/
                        
            """.trimIndent(),

            '*' to """
                    _    
                 /\| |/\ 
                 \ ` ' / 
                |_     _|
                 / , . \ 
                 \/|_|\/ 
                         
            """.trimIndent(),

            '(' to """
                  ___
                 /  /
                |  | 
                |  | 
                |  | 
                |  | 
                 \__\
            """.trimIndent(),

            ')' to """
                ___  
                \  \ 
                 |  |
                 |  |
                 |  |
                 |  |
                /__/ 
            """.trimIndent(),

            '1' to """
                 __  
                /_ | 
                 | | 
                 | | 
                 | | 
                 |_| 
                     
            """.trimIndent(),

            '2' to """
                 ___   
                |__ \  
                   ) | 
                  / /  
                 / /_  
                |____| 
                       
            """.trimIndent(),

            '3' to """
                 ____   
                |___ \  
                  __) | 
                 |__ <  
                 ___) | 
                |____/  
                        
            """.trimIndent(),

            '4' to """
                 _  _    
                | || |   
                | || |_  
                |__   _| 
                   | |   
                   |_|   
                         
            """.trimIndent(),

            '5' to """
                 _____  
                | ____| 
                | |__   
                |___ \  
                 ___) | 
                |____/  
                        
            """.trimIndent(),

            '6' to """
                   __   
                  / /   
                 / /_   
                | '_ \  
                | (_) | 
                 \___/  
                        
            """.trimIndent(),

            '7' to """
                 ______  
                |____  | 
                    / /  
                   / /   
                  / /    
                 /_/     
                         
            """.trimIndent(),

            '8' to """
                  ___   
                 / _ \  
                | (_) | 
                 > _ <  
                | (_) | 
                 \___/  
                        
            """.trimIndent(),

            '9' to """
                  ___   
                 / _ \  
                | (_) | 
                 \__, | 
                   / /  
                  /_/   
                        
            """.trimIndent(),

            '0' to """
                  ___   
                 / _ \  
                | | | | 
                | | | | 
                | |_| | 
                 \___/  
                        
            """.trimIndent(),

            )
    }
}
