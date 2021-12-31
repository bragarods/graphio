


class JanusGraphDB():
    def __init__(self, url="ws://janusgraph:8182/gremlin", graph_name="cnxinit"):
        self.__graph = url