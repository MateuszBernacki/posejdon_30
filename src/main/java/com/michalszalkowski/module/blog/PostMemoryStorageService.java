package com.michalszalkowski.module.blog;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Scope("singleton")
public class PostMemoryStorageService {

    private static final List<PostDto> STORAGE = new ArrayList<>();

    static {
        STORAGE.add(new PostDto( "Lorem ipsum dolor 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas gravida massa placerat felis viverra hendrerit. Donec tincidunt dictum rhoncus. Duis at diam nec lacus sollicitudin vestibulum a ac felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus mollis facilisis odio et fermentum. Proin at dolor eget enim aliquet finibus. Duis viverra mauris eget libero pulvinar tempus. Pellentesque consequat hendrerit tortor. Nullam volutpat arcu vitae erat vehicula, sollicitudin posuere risus dapibus. Duis vulputate purus ante, eu rhoncus nulla posuere at. In nulla mi, pellentesque sed augue nec, facilisis tincidunt quam. Nulla nec mollis lacus, vitae ultrices lectus. Duis a libero felis. Proin aliquet ipsum nec nunc eleifend, eu viverra nunc pulvinar. Duis urna justo, feugiat ut tristique ac, venenatis vitae lectus. Nulla ac tortor sit amet eros vehicula tristique. "));
        STORAGE.add(new PostDto( "Lorem ipsum dolor 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas gravida massa placerat felis viverra hendrerit. Donec tincidunt dictum rhoncus. Duis at diam nec lacus sollicitudin vestibulum a ac felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus mollis facilisis odio et fermentum. Proin at dolor eget enim aliquet finibus. Duis viverra mauris eget libero pulvinar tempus. Pellentesque consequat hendrerit tortor. Nullam volutpat arcu vitae erat vehicula, sollicitudin posuere risus dapibus. Duis vulputate purus ante, eu rhoncus nulla posuere at. In nulla mi, pellentesque sed augue nec, facilisis tincidunt quam. Nulla nec mollis lacus, vitae ultrices lectus. Duis a libero felis. Proin aliquet ipsum nec nunc eleifend, eu viverra nunc pulvinar. Duis urna justo, feugiat ut tristique ac, venenatis vitae lectus. Nulla ac tortor sit amet eros vehicula tristique. "));
    }

    public Optional<PostDto> getPost(String uuid) {
        return STORAGE
                .stream()
                .filter(post -> post.getUuid().equalsIgnoreCase(uuid)).findFirst();
    }

    public List<PostDto> getPosts() {
        return STORAGE;
    }

    public PostDto create(String title, String text) {
        PostDto post = new PostDto(title, text);
        STORAGE.add(post);
        return post;
    }
}

