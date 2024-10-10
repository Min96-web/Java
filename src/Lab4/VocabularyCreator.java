package Lab4;

public class VocabularyCreator {
    String[] prompt = {"bil : ", "hus : ", "springa : ", "blå : ", "baka : ", "hoppa : ", "simma : ", "måne : ", "väg : ", "snäll : "};
    String[] answer = {"car", "house", "run", "blue", "bake", "jump", "swim", "moon", "road", "kind", "Q"};
    Vocabulary[] vocabularies = {new Vocabulary(prompt[0], answer[0]), new Vocabulary(prompt[1], answer[1]),
            new Vocabulary(prompt[2], answer[2]), new Vocabulary(prompt[3], answer[3]), new Vocabulary(prompt[4], answer[4]),
            new Vocabulary(prompt[5], answer[5]), new Vocabulary(prompt[6], answer[6]), new Vocabulary(prompt[7], answer[7]),
            new Vocabulary(prompt[8], answer[8]), new Vocabulary(prompt[9], answer[9])
    };
}
